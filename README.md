# Minecraft Multiloader Mod Template

A template for multiloader Minecraft mods, made to easily be able to create new mods.

## Usage

1. Copy the template
2. Rename the folder to your mod's ID
    - Your mod's ID should not contain spaces/dashes
3. Find and replace `templateorganization` with your Git organization
4. Find and replace `templatemod` with your mod's ID
5. Rename all folders named `io.github.steveplays28` to your mod's Maven group
6. Rename all folders named `templatemod` to your mod's ID
7. Edit `gradle.properties`
8. Remove `README.md`
9. Rename `README_template.md` to `README.md`
10. Remove `LICENSE`
11. Rename `LICENSE_template` to `LICENSE`
12. In `LICENSE`, replace `CURRENT_YEAR` with the current year and `AUTHOR` with your name

## Contributing

If you've encountered a problem or you want to suggest
features, [create an issue](https://github.com/steves-underwater-paradise/multiloadertemplatemodmc/issues/new) on the issue tracker.

### Development

- `git clone https://github.com/steves-underwater-paradise/multiloadertemplatemodmc.git`
- `cd templatemod`
- `./gradlew build`

## License

This project is licensed under MIT,
see [LICENSE](https://github.com/steves-underwater-paradise/multiloadertemplatemodmc/blob/1.20-1.20.1/LICENSE).

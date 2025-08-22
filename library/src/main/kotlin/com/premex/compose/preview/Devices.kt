package com.premex.compose.preview

import kotlin.String

/**
 * Extended device specifications for Android Compose previews.
 *
 * This object provides device specifications that can be used with @Preview annotations
 * in Android Compose, extending the built-in device list with devices from the Android
 * Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PIXEL_8)
 * @Preview(device = Devices.Samsung.GALAXY_S24)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 *
 * NOTE: Device specifications are automatically generated from the Android Device Catalog:
 * https://raw.githubusercontent.com/hossain-khan/android-device-catalog-parser/refs/heads/main/lib/src/test/resources/android-devices-catalog.csv
 *
 * Run ./gradlew :device-generator:run to refresh with the latest catalog data.
 * // Google Pixel Devices
 */
public object Devices {
  public const val DEFAULT: String = ""

  public const val PIXEL_8: String = "id:pixel_8"

  public const val PIXEL_8_PRO: String = "id:pixel_8_pro"
}

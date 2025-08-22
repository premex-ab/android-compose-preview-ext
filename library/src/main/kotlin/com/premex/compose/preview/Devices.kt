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
 * // Google Nexus Devices
 *
 * // Google Pixel Devices
 *
 * // Automotive
 */
public object Devices {
  public const val DEFAULT: String = ""

  public const val NEXUS_10: String = "id:Nexus 10"

  public const val NEXUS_5: String = "id:Nexus 5"

  public const val NEXUS_5X: String = "id:Nexus 5X"

  public const val NEXUS_6: String = "id:Nexus 6"

  public const val NEXUS_6P: String = "id:Nexus 6P"

  public const val NEXUS_7: String = "id:Nexus 7"

  public const val NEXUS_7_2013: String = "id:Nexus 7 2013"

  public const val NEXUS_9: String = "id:Nexus 9"

  public const val PIXEL: String = "id:pixel"

  public const val PIXEL_2: String = "id:pixel_2"

  public const val PIXEL_2_XL: String = "id:pixel_2_xl"

  public const val PIXEL_3: String = "id:pixel_3"

  public const val PIXEL_3_XL: String = "id:pixel_3_xl"

  public const val PIXEL_3A: String = "id:pixel_3a"

  public const val PIXEL_3A_XL: String = "id:pixel_3a_xl"

  public const val PIXEL_4: String = "id:pixel_4"

  public const val PIXEL_4_XL: String = "id:pixel_4_xl"

  public const val PIXEL_4A: String = "id:pixel_4a"

  public const val PIXEL_5: String = "id:pixel_5"

  public const val PIXEL_6: String = "id:pixel_6"

  public const val PIXEL_6_PRO: String = "id:pixel_6_pro"

  public const val PIXEL_6A: String = "id:pixel_6a"

  public const val PIXEL_7: String = "id:pixel_7"

  public const val PIXEL_7_PRO: String = "id:pixel_7_pro"

  public const val PIXEL_7A: String = "id:pixel_7a"

  public const val PIXEL_8: String = "id:pixel_8"

  public const val PIXEL_8_PRO: String = "id:pixel_8_pro"

  public const val PIXEL_8A: String = "id:pixel_8a"

  public const val PIXEL_9: String = "id:pixel_9"

  public const val PIXEL_9_PRO: String = "id:pixel_9_pro"

  public const val PIXEL_9_PRO_FOLD: String = "id:pixel_9_pro_fold"

  public const val PIXEL_9_PRO_XL: String = "id:pixel_9_pro_xl"

  public const val PIXEL_C: String = "id:pixel_c"

  public const val PIXEL_FOLD: String = "id:pixel_fold"

  public const val PIXEL_TABLET: String = "id:pixel_tablet"

  public const val PIXEL_XL: String = "id:pixel_xl"

  public const val AUTOMOTIVE_1024P_LANDSCAPE: String = "id:automotive_1024p_landscape"
}

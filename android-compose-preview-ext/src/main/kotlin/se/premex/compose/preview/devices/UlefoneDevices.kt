package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ulefone device specifications for Android Compose previews.
 *
 * This extension provides ulefone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ulefone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ulefone: Any
  get() = object {
      /** ulefone Armor_3 */
      val ARMOR_3 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** ulefone MIX_2 */
      val MIX_2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ulefone Power_3 */
      val POWER_3 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** ulefone Power_3S */
      val POWER_3S = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** ulefone t816_gq_ulefone */
      val T816_GQ_ULEFONE = "spec:width=720,height=1280,unit=px,dpi=320"

  }

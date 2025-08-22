package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Pioneer device specifications for Android Compose previews.
 *
 * This extension provides Pioneer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pioneer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pioneer: Any
  get() = object {
      /** Pioneer Fu_Zin2R_32 */
      val FU_ZIN2R_32 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Pioneer Fu_Zin_32 */
      val FU_ZIN_32 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Pioneer SDA_80TAB */
      val SDA_80TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Pioneer SDA_835TAB */
      val SDA_835TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Pioneer SDA_8TAB */
      val SDA_8TAB = "spec:width=800,height=1280,unit=px,dpi=213"

  }

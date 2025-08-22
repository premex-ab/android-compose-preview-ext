package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * true device specifications for Android Compose previews.
 *
 * This extension provides true device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.True.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.True: Any
  get() = object {
      /** true S1 */
      val S1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** true S1A */
      val S1A = "spec:width=720,height=1600,unit=px,dpi=320"

      /** true SMART_4G */
      val SMART_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** true SMART_4G_ADVENTURE */
      val SMART_4G_ADVENTURE = "spec:width=480,height=800,unit=px,dpi=240"

      /** true SMART_4G_GEN_C_5 */
      val SMART_4G_GEN_C_5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** true SMART_4G_GEN_C_5_5 */
      val SMART_4G_GEN_C_5_5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** true SMART_4G_P1 */
      val SMART_4G_P1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** true SMART_4G_P1_PRIME */
      val SMART_4G_P1_PRIME = "spec:width=720,height=1440,unit=px,dpi=320"

  }

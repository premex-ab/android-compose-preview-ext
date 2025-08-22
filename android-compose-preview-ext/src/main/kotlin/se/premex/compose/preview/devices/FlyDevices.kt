package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Fly device specifications for Android Compose previews.
 *
 * This extension provides Fly device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fly.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fly: Any
  get() = object {
      /** Fly Cirrus_13 */
      val CIRRUS_13 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Fly Cirrus_2 */
      val CIRRUS_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Fly Cirrus_3 */
      val CIRRUS_3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Fly Cirrus_4 */
      val CIRRUS_4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Fly Compact_4G */
      val COMPACT_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** Fly Flylife_Connect_101_3G_2 */
      val FLYLIFE_CONNECT_101_3G_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Fly IQ4514_Quad */
      val IQ4514_QUAD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Fly IQ456 */
      val IQ456 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Fly Nimbus_16 */
      val NIMBUS_16 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Fly Nimbus_8 */
      val NIMBUS_8 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Fly Nimbus_9 */
      val NIMBUS_9 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Fly Slimline */
      val SLIMLINE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Fly Stratus_6 */
      val STRATUS_6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Fly ViewMax */
      val VIEWMAX = "spec:width=540,height=1132,unit=px,dpi=240"

  }

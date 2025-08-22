package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Elo device specifications for Android Compose previews.
 *
 * This extension provides Elo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Elo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Elo: Any
  get() = object {
      /** Elo Backpack-4 */
      val BACKPACK_4 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** Elo Backpack-4-Value */
      val BACKPACK_4_VALUE = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** Elo Elo-i3-10Std */
      val ELO_I3_10STD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Elo Elo-i3-15Std */
      val ELO_I3_15STD = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** Elo Elo-i3-22Std */
      val ELO_I3_22STD = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** Elo Elo-i3-PUCK */
      val ELO_I3_PUCK = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** Elo M50 */
      val M50 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** Elo 10in-I-Series-4 */
      val _10IN_I_SERIES_4 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Elo 10in-I-Series-4-Value */
      val _10IN_I_SERIES_4_VALUE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Elo 15in-I-Series-4 */
      val _15IN_I_SERIES_4 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** Elo 15in-I-Series-4-USBC-V */
      val _15IN_I_SERIES_4_USBC_V = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** Elo 15in-I-Series-4-USB-C */
      val _15IN_I_SERIES_4_USB_C = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** Elo 15in-I-Series-4-Value */
      val _15IN_I_SERIES_4_VALUE = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** Elo 22in-I-Series-4 */
      val _22IN_I_SERIES_4 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** Elo 22in-I-Series-4-Value */
      val _22IN_I_SERIES_4_VALUE = "spec:width=1080,height=1920,unit=px,dpi=240"

  }

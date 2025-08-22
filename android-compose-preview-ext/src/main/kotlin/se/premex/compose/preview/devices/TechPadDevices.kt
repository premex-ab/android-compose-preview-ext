package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Tech_Pad device specifications for Android Compose previews.
 *
 * This extension provides Tech_Pad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TechPad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TechPad: Any
  get() = object {
      /** Tech_Pad Tech_Pad_3G16 */
      val TECH_PAD_3G16 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Tech_Pad Tech_Pad_732 */
      val TECH_PAD_732 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Tech_Pad Tech_Pad_S813G */
      val TECH_PAD_S813G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Tech_Pad Tech_Pad_X10 */
      val TECH_PAD_X10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Tech_Pad X11 */
      val X11 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Tech_Pad X9_PLUS */
      val X9_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Tech_Pad 816 */
      val _816 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Umx device specifications for Android Compose previews.
 *
 * This extension provides Umx device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Umx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Umx: Any
  get() = object {
      /** Umx U2VR */
      val U2VR = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Umx U2-PLUS-TE-VR */
      val U2_PLUS_TE_VR = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Umx U3AR */
      val U3AR = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Umx U504TL */
      val U504TL = "spec:width=480,height=854,unit=px,dpi=240"

      /** Umx U673C */
      val U673C = "spec:width=480,height=800,unit=px,dpi=240"

      /** Umx U683CL */
      val U683CL = "spec:width=480,height=854,unit=px,dpi=240"

      /** Umx U693CL */
      val U693CL = "spec:width=480,height=854,unit=px,dpi=240"

      /** Umx U696CL */
      val U696CL = "spec:width=720,height=1560,unit=px,dpi=320"

  }

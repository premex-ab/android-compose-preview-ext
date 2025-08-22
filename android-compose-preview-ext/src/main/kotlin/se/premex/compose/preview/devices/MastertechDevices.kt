package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MASTERTECH device specifications for Android Compose previews.
 *
 * This extension provides MASTERTECH device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mastertech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mastertech: Any
  get() = object {
      /** MASTERTECH lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MASTERTECH M2M-3T */
      val M2M_3T = "spec:width=600,height=1024,unit=px,dpi=213"

      /** MASTERTECH mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MASTERTECH R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MASTERTECH R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MASTERTECH 77-EV */
      val _77_EV = "spec:width=600,height=1024,unit=px,dpi=160"

  }

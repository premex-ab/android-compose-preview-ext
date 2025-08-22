package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Newland device specifications for Android Compose previews.
 *
 * This extension provides Newland device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Newland.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Newland: Any
  get() = object {
      /** Newland NLS-MT6550-AM */
      val NLS_MT6550_AM = "spec:width=480,height=800,unit=px,dpi=240"

      /** Newland NLS-MT6552-EEA */
      val NLS_MT6552_EEA = "spec:width=480,height=800,unit=px,dpi=240"

      /** Newland NLS-MT6552-GL */
      val NLS_MT6552_GL = "spec:width=480,height=800,unit=px,dpi=240"

      /** Newland NLS-MT6555-GL */
      val NLS_MT6555_GL = "spec:width=480,height=800,unit=px,dpi=240"

      /** Newland NLS-MT6755-GL */
      val NLS_MT6755_GL = "spec:width=480,height=800,unit=px,dpi=240"

      /** Newland NLS-MT9052-GL */
      val NLS_MT9052_GL = "spec:width=720,height=1280,unit=px,dpi=294"

      /** Newland NLS-MT9055-GL */
      val NLS_MT9055_GL = "spec:width=720,height=1280,unit=px,dpi=294"

      /** Newland NLS-MT90-GL */
      val NLS_MT90_GL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Newland NLS-MT93 */
      val NLS_MT93 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Newland NLS-MT95 */
      val NLS_MT95 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** Newland NLS-N7 */
      val NLS_N7 = "spec:width=480,height=800,unit=px,dpi=160"

      /** Newland NLS-N7-GL */
      val NLS_N7_GL = "spec:width=480,height=800,unit=px,dpi=213"

      /** Newland NLS-NFT10-GL */
      val NLS_NFT10_GL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Newland NLS-NQuire */
      val NLS_NQUIRE = "spec:width=800,height=1280,unit=px,dpi=160"

  }

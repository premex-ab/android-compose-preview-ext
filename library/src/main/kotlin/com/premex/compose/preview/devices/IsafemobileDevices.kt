package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * isafemobile device specifications for Android Compose previews.
 *
 * This extension provides isafemobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Isafemobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Isafemobile: Any
  get() = object {
      /** isafemobile IS330 */
      val IS330 = "spec:width=320,height=432,unit=px,dpi=160"

      /** isafemobile IS530 */
      val IS530 = "spec:width=480,height=854,unit=px,dpi=240"

      /** isafemobile IS540 */
      val IS540 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** isafemobile IS655 */
      val IS655 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** isafemobile IS880 */
      val IS880 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** isafemobile IS930 */
      val IS930 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** isafemobile IS940 */
      val IS940 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }

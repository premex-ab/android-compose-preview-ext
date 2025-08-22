package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CASIO device specifications for Android Compose previews.
 *
 * This extension provides CASIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CASIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CASIO: Any
  get() = object {
      /** CASIO dtx400 */
      val DTX400 = "spec:width=480,height=800,unit=px,dpi=240"

      /** CASIO dtx450 */
      val DTX450 = "spec:width=480,height=800,unit=px,dpi=220"

      /** CASIO itg400 */
      val ITG400 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CASIO itg600 */
      val ITG600 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CASIO itg650 */
      val ITG650 = "spec:width=720,height=1440,unit=px,dpi=320"

  }

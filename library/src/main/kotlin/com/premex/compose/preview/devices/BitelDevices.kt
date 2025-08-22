package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bitel device specifications for Android Compose previews.
 *
 * This extension provides Bitel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bitel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bitel: Any
  get() = object {
      /** Bitel B8416 */
      val B8416 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Bitel B8506 */
      val B8506 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bitel B9504 */
      val B9504 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Bitel BPRO */
      val BPRO = "spec:width=720,height=1280,unit=px,dpi=320"

  }

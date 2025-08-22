package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IXTECH device specifications for Android Compose previews.
 *
 * This extension provides IXTECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IXTECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IXTECH: Any
  get() = object {
      /** IXTECH IX1011 */
      val IX1011 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** IXTECH IX1012 */
      val IX1012 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }

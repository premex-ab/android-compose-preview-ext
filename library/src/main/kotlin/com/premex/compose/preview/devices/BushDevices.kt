package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * bush device specifications for Android Compose previews.
 *
 * This extension provides bush device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bush.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bush: Any
  get() = object {
      /** bush ac101boxv2 */
      val AC101BOXV2 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** bush ac101boxv3 */
      val AC101BOXV3 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** bush ac80oxv2 */
      val AC80OXV2 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }

package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EACHPAI device specifications for Android Compose previews.
 *
 * This extension provides EACHPAI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Eachpai.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Eachpai: Any
  get() = object {
      /** EACHPAI Q8 */
      val Q8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** EACHPAI 706 */
      val _706 = "spec:width=600,height=1024,unit=px,dpi=213"

  }

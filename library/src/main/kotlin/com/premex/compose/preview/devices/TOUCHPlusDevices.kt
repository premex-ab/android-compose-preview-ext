package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TOUCH_Plus device specifications for Android Compose previews.
 *
 * This extension provides TOUCH_Plus device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TOUCHPlus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TOUCHPlus: Any
  get() = object {
      /** TOUCH_Plus AS1000 */
      val AS1000 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TOUCH_Plus 770N */
      val _770N = "spec:width=600,height=1024,unit=px,dpi=160"

  }

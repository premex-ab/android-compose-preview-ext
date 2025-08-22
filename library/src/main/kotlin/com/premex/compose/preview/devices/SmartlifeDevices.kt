package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMARTLIFE device specifications for Android Compose previews.
 *
 * This extension provides SMARTLIFE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Smartlife.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Smartlife: Any
  get() = object {
      /** SMARTLIFE SL-TAB10232 */
      val SL_TAB10232 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

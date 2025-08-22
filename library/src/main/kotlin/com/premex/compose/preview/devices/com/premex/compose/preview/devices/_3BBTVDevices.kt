package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * 3BBTV device specifications for Android Compose previews.
 *
 * This extension provides 3BBTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices._3BBTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices._3BBTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=3BBTV, code=TBBTV01, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=3BBTV, code=TBBTV01, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TBBTV01 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

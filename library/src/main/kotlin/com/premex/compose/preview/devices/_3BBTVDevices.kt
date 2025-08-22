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
      /** 3BBTV TBBTV01 */
      val TBBTV01 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

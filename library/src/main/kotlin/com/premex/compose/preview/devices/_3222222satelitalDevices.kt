package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * 3222222Satelital device specifications for Android Compose previews.
 *
 * This extension provides 3222222Satelital device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices._3222222satelital.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices._3222222satelital: Any
  get() = object {
      /** 3222222Satelital G706 */
      val G706 = "spec:width=600,height=1024,unit=px,dpi=160"

  }

package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ROYQUEEN device specifications for Android Compose previews.
 *
 * This extension provides ROYQUEEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Royqueen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Royqueen: Any
  get() = object {
      /** ROYQUEEN RQ-713S */
      val RQ_713S = "spec:width=600,height=1024,unit=px,dpi=160"

  }

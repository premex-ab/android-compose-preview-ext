package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TAGITAL device specifications for Android Compose previews.
 *
 * This extension provides TAGITAL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tagital.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tagital: Any
  get() = object {
      /** TAGITAL K88 */
      val K88 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TAGITAL T7K-PLUS */
      val T7K_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

  }

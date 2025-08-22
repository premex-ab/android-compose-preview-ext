package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TOKECY device specifications for Android Compose previews.
 *
 * This extension provides TOKECY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tokecy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tokecy: Any
  get() = object {
      /** TOKECY T847 */
      val T847 = "spec:width=800,height=1332,unit=px,dpi=160"

      /** TOKECY T847_EEA */
      val T847_EEA = "spec:width=800,height=1332,unit=px,dpi=160"

  }

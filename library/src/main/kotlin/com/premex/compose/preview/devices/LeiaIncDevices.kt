package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LeiaInc device specifications for Android Compose previews.
 *
 * This extension provides LeiaInc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LeiaInc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LeiaInc: Any
  get() = object {
      /** LeiaInc LumePad */
      val LUMEPAD = "spec:width=1600,height=2560,unit=px,dpi=320"

  }

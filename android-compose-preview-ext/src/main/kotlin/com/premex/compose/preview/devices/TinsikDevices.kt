package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TINSIK device specifications for Android Compose previews.
 *
 * This extension provides TINSIK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tinsik.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tinsik: Any
  get() = object {
      /** TINSIK A19_Plus */
      val A19_PLUS = "spec:width=540,height=1200,unit=px,dpi=200"

  }

package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LAVIETabE device specifications for Android Compose previews.
 *
 * This extension provides LAVIETabE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lavietabe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lavietabe: Any
  get() = object {
      /** LAVIETabE X704F */
      val X704F = "spec:width=1200,height=1920,unit=px,dpi=240"

  }

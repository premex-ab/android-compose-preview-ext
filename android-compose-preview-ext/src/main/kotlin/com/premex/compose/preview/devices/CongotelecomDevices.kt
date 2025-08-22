package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CongoTelecom device specifications for Android Compose previews.
 *
 * This extension provides CongoTelecom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Congotelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Congotelecom: Any
  get() = object {
      /** CongoTelecom Speed */
      val SPEED = "spec:width=720,height=1600,unit=px,dpi=280"

  }

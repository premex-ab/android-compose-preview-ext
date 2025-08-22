package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * essential device specifications for Android Compose previews.
 *
 * This extension provides essential device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Essential.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Essential: Any
  get() = object {
      /** essential mata */
      val MATA = "spec:width=1316,height=2560,unit=px,dpi=480"

  }

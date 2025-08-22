package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MyBox device specifications for Android Compose previews.
 *
 * This extension provides MyBox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MyBox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MyBox: Any
  get() = object {
      /** MyBox DV8020 */
      val DV8020 = "spec:width=720,height=1280,unit=px,dpi=213"

  }

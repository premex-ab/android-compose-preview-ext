package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ElisaElamus device specifications for Android Compose previews.
 *
 * This extension provides ElisaElamus device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ElisaElamus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ElisaElamus: Any
  get() = object {
      /** ElisaElamus uzw4026ele */
      val UZW4026ELE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

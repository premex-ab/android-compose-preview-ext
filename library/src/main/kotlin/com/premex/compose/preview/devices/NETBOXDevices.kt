package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NETBOX device specifications for Android Compose previews.
 *
 * This extension provides NETBOX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NETBOX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NETBOX: Any
  get() = object {
      /** NETBOX uiw4030dnm */
      val UIW4030DNM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

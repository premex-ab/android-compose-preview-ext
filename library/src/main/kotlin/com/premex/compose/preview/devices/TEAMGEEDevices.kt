package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TEAMGEE device specifications for Android Compose previews.
 *
 * This extension provides TEAMGEE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TEAMGEE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TEAMGEE: Any
  get() = object {
      /** TEAMGEE G2 */
      val G2 = "spec:width=1080,height=1920,unit=px,dpi=216"

  }

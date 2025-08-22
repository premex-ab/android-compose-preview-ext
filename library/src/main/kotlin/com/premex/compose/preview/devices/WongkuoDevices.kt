package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WONGKUO device specifications for Android Compose previews.
 *
 * This extension provides WONGKUO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wongkuo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wongkuo: Any
  get() = object {
      /** WONGKUO T20 */
      val T20 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }

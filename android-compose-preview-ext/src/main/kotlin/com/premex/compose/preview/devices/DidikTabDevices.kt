package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIDIK_TAB device specifications for Android Compose previews.
 *
 * This extension provides DIDIK_TAB device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DidikTab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DidikTab: Any
  get() = object {
      /** DIDIK_TAB DT24 */
      val DT24 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

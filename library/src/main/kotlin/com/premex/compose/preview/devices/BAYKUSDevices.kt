package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BAYKUS device specifications for Android Compose previews.
 *
 * This extension provides BAYKUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BAYKUS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BAYKUS: Any
  get() = object {
      /** BAYKUS BKM10 */
      val BKM10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

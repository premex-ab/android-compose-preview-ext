package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Concord device specifications for Android Compose previews.
 *
 * This extension provides Concord device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Concord.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Concord: Any
  get() = object {
      /** Concord A10 */
      val A10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Concord Concord_M15 */
      val CONCORD_M15 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Concord Concord_RANGE_HS */
      val CONCORD_RANGE_HS = "spec:width=600,height=1024,unit=px,dpi=160"

  }

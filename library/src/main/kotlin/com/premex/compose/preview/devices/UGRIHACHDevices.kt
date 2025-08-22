package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UGRIHACH device specifications for Android Compose previews.
 *
 * This extension provides UGRIHACH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UGRIHACH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UGRIHACH: Any
  get() = object {
      /** UGRIHACH C11 */
      val C11 = "spec:width=800,height=1332,unit=px,dpi=160"

  }

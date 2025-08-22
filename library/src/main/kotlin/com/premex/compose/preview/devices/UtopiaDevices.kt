package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UTOPIA device specifications for Android Compose previews.
 *
 * This extension provides UTOPIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Utopia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Utopia: Any
  get() = object {
      /** UTOPIA UH0342 */
      val UH0342 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

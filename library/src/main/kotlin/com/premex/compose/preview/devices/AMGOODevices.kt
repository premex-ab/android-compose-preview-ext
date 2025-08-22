package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AMGOO device specifications for Android Compose previews.
 *
 * This extension provides AMGOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AMGOO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AMGOO: Any
  get() = object {
      /** AMGOO AM515 */
      val AM515 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** AMGOO AM518 */
      val AM518 = "spec:width=480,height=854,unit=px,dpi=240"

      /** AMGOO AM530 */
      val AM530 = "spec:width=480,height=854,unit=px,dpi=240"

  }

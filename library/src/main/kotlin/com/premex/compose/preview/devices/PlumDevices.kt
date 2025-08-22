package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PLUM device specifications for Android Compose previews.
 *
 * This extension provides PLUM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Plum.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Plum: Any
  get() = object {
      /** PLUM Z555 */
      val Z555 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** PLUM Z570 */
      val Z570 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** PLUM Z711 */
      val Z711 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PLUM Z712 */
      val Z712 = "spec:width=600,height=1024,unit=px,dpi=213"

  }

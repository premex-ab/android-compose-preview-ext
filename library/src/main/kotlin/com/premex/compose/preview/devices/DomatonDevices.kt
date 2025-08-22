package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DOMATON device specifications for Android Compose previews.
 *
 * This extension provides DOMATON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Domaton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Domaton: Any
  get() = object {
      /** DOMATON D102 */
      val D102 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DOMATON D718 */
      val D718 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DOMATON K111 */
      val K111 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

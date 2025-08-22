package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XTRATECH_IGUANAPAD device specifications for Android Compose previews.
 *
 * This extension provides XTRATECH_IGUANAPAD device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XtratechIguanapad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XtratechIguanapad: Any
  get() = object {
      /** XTRATECH_IGUANAPAD X8MT16 */
      val X8MT16 = "spec:width=800,height=1280,unit=px,dpi=213"

  }

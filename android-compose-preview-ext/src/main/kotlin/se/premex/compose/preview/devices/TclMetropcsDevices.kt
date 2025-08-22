package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TCL_MetroPCS device specifications for Android Compose previews.
 *
 * This extension provides TCL_MetroPCS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TclMetropcs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TclMetropcs: Any
  get() = object {
      /** TCL_MetroPCS Yaris5TMO */
      val YARIS5TMO = "spec:width=540,height=960,unit=px,dpi=240"

  }

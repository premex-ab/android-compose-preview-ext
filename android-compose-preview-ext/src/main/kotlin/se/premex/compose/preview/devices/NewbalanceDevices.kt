package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * newbalance device specifications for Android Compose previews.
 *
 * This extension provides newbalance device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Newbalance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Newbalance: Any
  get() = object {
      /** newbalance shasta */
      val SHASTA = "spec:width=400,height=400,unit=px,dpi=280"

  }

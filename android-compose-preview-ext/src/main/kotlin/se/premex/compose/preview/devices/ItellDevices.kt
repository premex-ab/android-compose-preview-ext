package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ITELL device specifications for Android Compose previews.
 *
 * This extension provides ITELL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Itell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Itell: Any
  get() = object {
      /** ITELL ITELL_K4700Q */
      val ITELL_K4700Q = "spec:width=600,height=1024,unit=px,dpi=213"

  }

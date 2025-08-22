package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * juniper device specifications for Android Compose previews.
 *
 * This extension provides juniper device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Juniper.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Juniper: Any
  get() = object {
      /** juniper MS3A */
      val MS3A = "spec:width=800,height=1280,unit=px,dpi=213"

  }

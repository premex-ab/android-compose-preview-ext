package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TAMBO device specifications for Android Compose previews.
 *
 * This extension provides TAMBO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tambo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tambo: Any
  get() = object {
      /** TAMBO TA-55_Power */
      val TA_55_POWER = "spec:width=720,height=1280,unit=px,dpi=320"

  }

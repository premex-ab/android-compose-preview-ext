package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * InnJoo device specifications for Android Compose previews.
 *
 * This extension provides InnJoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Innjoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Innjoo: Any
  get() = object {
      /** InnJoo F106_Plus */
      val F106_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

  }

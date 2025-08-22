package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * QUBER device specifications for Android Compose previews.
 *
 * This extension provides QUBER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Quber.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Quber: Any
  get() = object {
      /** QUBER QA3O_M110 */
      val QA3O_M110 = "spec:width=720,height=1280,unit=px,dpi=320"

  }

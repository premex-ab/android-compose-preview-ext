package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Continental device specifications for Android Compose previews.
 *
 * This extension provides Continental device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Continental.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Continental: Any
  get() = object {
      /** Continental bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Continental CE10412-26 */
      val CE10412_26 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Continental komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Continental tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Continental yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
